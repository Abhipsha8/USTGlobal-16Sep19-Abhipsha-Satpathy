import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-abhi',
  templateUrl: './abhi.component.html',
  styleUrls: ['./abhi.component.css']
})
export class AbhiComponent implements OnInit {
  entr;
  sport;
  bis;

  constructor(private http: HttpClient) {
    this.getEnt();
    this.getBis();
    this.getSport();
   }

  ngOnInit() {
  }getEnt() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=7ed2ab24a890457da076721c5c2b6bf5').subscribe(data => {
    this.entr = data.articles;
    console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got successfully');
    } );
  }
  getBis() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=de&category=business&apiKey=7ed2ab24a890457da076721c5c2b6bf5').subscribe(d => {
    this.bis = d.articles;
    console.log(d);
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got successfully');
    } );
  }
  getSport() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?q=trump&apiKey=7ed2ab24a890457da076721c5c2b6bf5').subscribe(d1 => {
    this.sport = d1.articles;
    console.log(d1);
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got successfully');
    } );
  }
  

}
