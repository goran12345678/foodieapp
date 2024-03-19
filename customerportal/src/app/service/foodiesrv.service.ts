import { Injectable } from '@angular/core';
import { Menu } from '../model/menu';
import { Order } from '../model/order';
import { HttpClient } from '@angular/common/http'
import {Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FoodieService {

  constructor(public http: HttpClient) { }


 
  getTotal(menu:Menu): Observable<Number>{
    return this.http.post<Number>("http://localhost:9090/api/gettotal", menu)
  }

  getMenus(): Observable<Array<Menu>> {
    return this.http.get<Array<Menu>>("http://localhost:9090/api/getmenus")
  }

  submitOrder(order: Order): Observable<Response> {
    return this.http.post<Response>("http://localhost:9090/api/submitorder", order)
  }

}
