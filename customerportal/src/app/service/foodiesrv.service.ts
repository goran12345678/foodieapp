import { Injectable } from '@angular/core';
import { Menu } from '../model/menu';
import { Order } from '../model/order';
import { HttpClient } from '@angular/common/http'
import { ConnectableObservable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FoodieService {

  constructor(public http: HttpClient) { }


  getShoppingCart(): Array<Menu> {

    let result: Array<Menu> = new Array<Menu>()
    this.http.get("http://localhost:9090/api/getshoppingcart").subscribe({
      next: (data: any) => { result = data },
      error: (error: any) => { console.log("[FoodieService] getShoppingCart:Error:: ",error) },
      complete: () => { console.log("[FoodieService] getShoppingCart:Complete")  }
    })
    return result
  }

  addToShoppingCart(menu: Menu): Array<Menu> {

    let result: Array<Menu> = new Array<Menu>()
    this.http.post("http://localhost:9090/api/addtoshoppingcart", menu).subscribe({
      next: (data: any) => { result = data },
      error: (error: any) => { console.log("[FoodieService] addToShoppingCart:Error:: ",error) },
      complete: () => { console.log("[FoodieService] addToShoppingCart:Complete")  }
    })
    return result
  }

  removeFromShoppingCart(menu: Menu): Array<Menu> {

    let result: Array<Menu> = new Array<Menu>()
    this.http.post("http://localhost:9090/api/removefromshoppingcart", menu).subscribe({
      next: (data: any) => { result = data },
      error: (error: any) => {console.log("[FoodieService] removeFromShoppingCart:Error:: ",error) },
      complete: () => {console.log("[FoodieService] removeFromShoppingCart:Complete") }
    })
    return result

  }

  getMenus(): Array<Menu> {
    let result: Array<Menu> = new Array<Menu>()
    this.http.get("http://localhost:9090/api/getmenus").subscribe({
      next: (data: any) => { result = data },
      error: (error: any) => { console.log("[FoodieService] getMenus:Error:: ", error)},
      complete: () => { console.log("[FoodieService] getMenus:Complete")}
    })
    return result
  }

  getMenu(restaurantName: String): Menu {
    let result: Menu = new Menu()
    this.http.get("http://localhost:9090/api/getmenu?inegratorName=" + restaurantName).subscribe({
      next: (data: any) => { result = data },
      error: (error: any) => { console.log("[FoodieService] getMenu:Error:: ", error) },
      complete: () => {  console.log("[FoodieService] getMenu:Complete") }
    })
    return result
  }

  submitOrder(order: Order): Response {

    let result: Response = new Response()
    this.http.post("http://localhost:9090/api/submitorder", order).subscribe({
      next: (data: any) => { result = data },
      error: (error: any) => {  console.log("[FoodieService] submitOrder:Error:: ", error) },
      complete: () => {  console.log("[FoodieService] submitOrder:Complete") }
    })
    return result
  }

}
