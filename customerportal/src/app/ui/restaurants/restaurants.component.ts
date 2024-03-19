import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Menu } from 'src/app/model/menu';
import { DatashareService } from 'src/app/service/datashare.service';
import { FoodieService } from 'src/app/service/foodiesrv.service';

@Component({
  selector: 'app-restaurants',
  templateUrl: './restaurants.component.html',
  styleUrls: ['./restaurants.component.css']
})
export class RestaurantsComponent {
  restaurants:Array<Menu>

  constructor(private foodieSrv:FoodieService, private router:Router, private dataSrvc:DatashareService){ 
    this.restaurants = new Array<Menu>()
    this.getRestaurants()
  }

  getRestaurants():void{
    this.foodieSrv.getMenus().subscribe({
      next: (data: any) => { this.restaurants = data },
      error: (error: any) => { console.log("[RestaurantsComponent] getRestaurants:Error:: ", error) },
      complete: () => {  console.log("[RestaurantsComponent] getRestaurants:Complete") }
    })
  }
  selectRestaurant(restaurant:Menu):void{
    console.log("[RestaurantsComponent] selectRestaurant: " + restaurant.restaurantName)
    this.dataSrvc.setData(restaurant)
    this.router.navigate(['/menuitems'])
  }
}
