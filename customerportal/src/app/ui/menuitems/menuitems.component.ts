import { Component } from '@angular/core';
import { FoodieService } from 'src/app/service/foodiesrv.service';
import { MenuItem } from 'src/app/model/menuitem';
import { Menu } from 'src/app/model/menu';

@Component({
  selector: 'app-menuitems',
  templateUrl: './menuitems.component.html',
  styleUrls: ['./menuitems.component.css']
})
export class MenuitemsComponent {
  menu:any;
  menuitems:Array<MenuItem>

  constructor(public foodieSrv:FoodieService){
     this.menuitems = new Array<MenuItem>()
    }

    selectItem(item:MenuItem):void{
      this.menuitems.push(item);
    }
    removeItem(item:MenuItem):void{
      this.menuitems =  this.menuitems.filter((i) => {i.name != item.name})
    }
    addToShoppingCart():void{
      this.menu.menuItems = this.menuitems
      this.foodieSrv.addToShoppingCart(this.menu)
    }

}
