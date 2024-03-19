import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DatashareService {
  data:any

  constructor() { }

  getData():any{
    return this.data
  }
  setData(data:any){
    this.data = data
  }
}
