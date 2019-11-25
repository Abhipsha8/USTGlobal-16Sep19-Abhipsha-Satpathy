import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar;
  cars = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg',
      name : 'BMW'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2019/07/07/14/03/fiat-4322521__340.jpg',
      name : 'Audi'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2014/09/07/22/34/car-race-438467__340.jpg',
      name : 'Benz'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/11/22/23/44/buildings-1851246__340.jpg',
      name : 'Mustang'
    }
  ]

  constructor() { }

  ngOnInit() {
  }
  sendCar(car){
    console.log(car);
    this.selectedCar = car;
  }

}
