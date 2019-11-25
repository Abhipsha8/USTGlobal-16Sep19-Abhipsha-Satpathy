import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
inputdata;
entr;
  constructor(private http:HttpClient) { }

  ngOnInit() {
  }
  getEnt(event) {
    this.inputdata =event.target.value;
     this.http.get<any>('https://newsapi.org/v2/everything?from=2019-09-15&sortBy=publishedAt&apiKey=7ed2ab24a890457da076721c5c2b6bf5&q='+this.inputdata).subscribe(data => {
     this.entr = data.articles;
     console.log(data);
     }, err => {
       console.log(err);
     }, () => {
       console.log('news got successfully');
     } );
   }
  
  }