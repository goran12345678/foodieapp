import { Component } from '@angular/core';
import { FoodieService } from 'src/app/service/foodiesrv.service';
import { Menu } from 'src/app/model/menu';
import { MenuItem } from 'src/app/model/menuitem';
import { Payment } from 'src/app/model/payment';
import { Order } from 'src/app/model/order';
import { from } from 'rxjs';
import { DatashareService } from 'src/app/service/datashare.service';

@Component({
  selector: 'app-shoppingcart',
  templateUrl: './shoppingcart.component.html',
  styleUrls: ['./shoppingcart.component.css']
})
export class ShoppingcartComponent {
  menu: Menu
  payment: Payment
  ordersuccess: Boolean

  constructor(private foodieSrvc: FoodieService, private dataSrvc: DatashareService) {
    this.ordersuccess = false
    this.payment = new Payment()
    this.menu = dataSrvc.getData()
    this.getTotal()
  }

  removeMenu(item: MenuItem): void {
    this.menu.menuItems = this.menu.menuItems.filter((i: MenuItem) => {
      if (i.name == item.name) {
        i.isSelected = false
      }
      return true
    })
    this.getTotal()
    console.log("[ShoppingcartComponent] removeMenu: remove item " + item.name)
  }
  getSelected() {
    return this.menu.menuItems.filter((i: MenuItem) => i.isSelected)
  }
  getTotal(): void {
    this.foodieSrvc.getTotal(this.menu).subscribe({
      next: (data: any) => { this.menu.total = data },
      error: (error: any) => { console.log("[ShoppingcartComponent] getTotal:Error:: ", error) },
      complete: () => { console.log("[ShoppingcartComponent] getTotal:Complete") }
    })
  }
  submitOrder(): void {

    let order: Order = new Order()
    order.menu = this.menu
    order.payment = this.payment
    console.log("[ShoppingcartComponent] submitOrder: " + JSON.stringify(order)) 
    this.foodieSrvc.submitOrder(order).subscribe({
      next: (data: any) => {
        if (data.success == true){
          this.ordersuccess = true
        }
        else{
          this.ordersuccess = false
        }
      },
      error: (error: any) => { console.log("[ShoppingcartComponent] submitOrder:Error:: ", error) },
      complete: () => { console.log("[ShoppingcartComponent] submitOrder:Complete") }
    })
  }
}
