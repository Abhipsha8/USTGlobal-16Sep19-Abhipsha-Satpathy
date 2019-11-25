import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  name = 'Abhi';
  imgUrl = 'https://cdn.pixabay.com/photo/2019/09/26/15/46/girl-4506318__340.jpg';
  address = 'Bangalore';
  colorName = 'blue';
  isActive = false;
  constructor() { }

  ngOnInit() {
    setInterval(( ) => {
       this.colorName = 'red';
       this.isActive = !this.isActive;
    }, 3000);
  }

}
