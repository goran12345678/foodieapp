import { Component } from '@angular/core';
import { FoodieService } from 'src/app/service/foodiesrv.service';
import { Menu } from 'src/app/model/menu';
import { Payment } from 'src/app/model/payment';
import { Order } from 'src/app/model/order';
import { from } from 'rxjs';

@Component({
  selector: 'app-shoppingcart',
  templateUrl: './shoppingcart.component.html',
  styleUrls: ['./shoppingcart.component.css']
})
export class ShoppingcartComponent {
  menus:Array<Menu>
  payment:Payment

  constructor(public foodieSrvc:FoodieService){
     this.menus = new Array<Menu>()
     this.payment = new Payment()
     this.getShoppingCart()
    }

  getShoppingCart():void{
    this.foodieSrvc.getShoppingCart()
  }  
  removeMenu(menu:Menu):void{
    this.menus = this.menus.filter( (m) => m.restaurantName != menu.restaurantName)
  }
  submitOrder():void{
    for(let m of this.menus){
      let order:Order = new Order()
      order.menu = m
      order.payment = this.payment
      this.foodieSrvc.submitOrder(order) 
    }
  }
}
