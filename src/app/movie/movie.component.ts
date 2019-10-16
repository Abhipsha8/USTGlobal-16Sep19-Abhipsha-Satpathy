import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movie',
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.css']
})
export class MovieComponent implements OnInit {
  inputdata;
  entr;

  constructor(private http: HttpClient) { }

  ngOnInit() {
  }getEnt(event) {
    this.inputdata =event.target.value;
     this.http.get<any>(' http://www.omdbapi.com/?apikey=58a3d2e5&s='+this.inputdata).subscribe(data => {
     this.entr = data.Search;
     console.log(data);
     }, err => {
       console.log(err);
     }, () => {
       console.log('movies got successfully');
     } );
   }

}
