import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for',
  templateUrl: './ng-for.component.html',
  styleUrls: ['./ng-for.component.css']
})
export class NgForComponent implements OnInit {
 Products = [
   {
     img : 'https://cdn.pixabay.com/photo/2015/07/03/23/30/frog-830869__340.jpg',
     name: 'toy',
     price: 4444,
  }, {
     img : 'https://cdn.pixabay.com/photo/2017/04/06/16/57/auto-2208807__340.png',
     name: 'car',
     price: 7788787,
  }, {
   img : 'https://cdn.pixabay.com/photo/2019/08/27/11/36/old-houses-4433982__340.jpg',
   name: 'watch',
   price: 5000,
  }
 ];
  constructor() { }

  ngOnInit() {
  }

}
