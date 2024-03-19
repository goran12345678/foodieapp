import { Component } from '@angular/core';
import { FoodieService } from 'src/app/service/foodiesrv.service';
import { MenuItem } from 'src/app/model/menuitem';
import { Menu } from 'src/app/model/menu';
import { DatashareService } from 'src/app/service/datashare.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menuitems',
  templateUrl: './menuitems.component.html',
  styleUrls: ['./menuitems.component.css']
})
export class MenuitemsComponent {
  menu:any;

  constructor(private foodieSrv:FoodieService,private router:Router, private dataSrvc:DatashareService){
     this.menu = dataSrvc.getData()
    }

    checkChanged(event:Event, item:MenuItem){
      const isCheck = (<HTMLInputElement> event.target).checked
      if(isCheck == true){
        this.selectItem(item)
      }else{
        this.removeItem(item)
      }
    }
    selectItem(item:MenuItem):void{
      this.menu.menuItems =  this.menu.menuItems.filter((i:MenuItem) => {
        if(i.name == item.name)
        {
          i.isSelected = true
        }
        return true
      })
      console.log("[MenuitemsComponent] checkChanged: select item " + item.name)
    }
    removeItem(item:MenuItem):void{
      this.menu.menuItems =  this.menu.menuItems.filter((i:MenuItem) => {
        if(i.name == item.name)
        {
          i.isSelected = false
        }
        return true
      })
      console.log("[MenuitemsComponent] checkChanged: remove item " + item.name)
    }
    addToShoppingCart():void{
      this.dataSrvc.setData(this.menu)

      this.router.navigate(['/shoppingcart'])
    }
}
