import { Menu } from "./menu";
import { Payment } from "./payment";

export class Order {
    menu:Menu;
	payment:Payment;
    constructor(){
        this.menu = new Menu();
        this.payment = new Payment()
    }
}
