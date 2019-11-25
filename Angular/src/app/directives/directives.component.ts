import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent implements OnInit {
   
   form = new FormGroup({
     email: new FormControl('', [Validators.required]),
     password: new FormControl('', [Validators.required])
   });

  constructor() { }

  ngOnInit() {
  }

}
