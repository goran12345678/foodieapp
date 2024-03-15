import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MenuitemsComponent } from './ui/menuitems/menuitems.component';
import { RestaurantsComponent } from './ui/restaurants/restaurants.component';
import { ShoppingcartComponent } from './ui/shoppingcart/shoppingcart.component';

const routes: Routes = [
  {path:'restaurants',component:RestaurantsComponent},
  {path:'menuitems',component:MenuitemsComponent},
  {path:'shoppingcart',component:ShoppingcartComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
