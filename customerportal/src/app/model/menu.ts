import { MenuItem } from "./menuitem";

export class Menu {

    restaurantName:String = ""; 
	restaurantHours:String = ""; 
    restaurantAddress:String = ""; 
	menuItems:Array<MenuItem> = [];
	total:Number = 0.0;
}
