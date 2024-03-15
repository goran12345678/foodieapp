import { Component } from '@angular/core';
import { Menu } from 'src/app/model/menu';
import { FoodieService } from 'src/app/service/foodiesrv.service';

@Component({
  selector: 'app-restaurants',
  templateUrl: './restaurants.component.html',
  styleUrls: ['./restaurants.component.css']
})
export class RestaurantsComponent {
  restaurants:Array<Menu>

  constructor(public foodieSrv:FoodieService){ 
    this.restaurants = new Array<Menu>()
    this.getRestaurants()
  }

  getRestaurants():Array<Menu>{
    return this.foodieSrv.getMenus()
  }
  selectResaurant(restaurant:Menu):void{
    console.log("[RestaurantsComponent] selectResaurant: " + restaurant.restaurantName)
  }

}
