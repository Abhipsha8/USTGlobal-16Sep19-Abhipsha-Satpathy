import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { CountriesComponent } from './countries/countries.component';
import { AbhiComponent } from './abhi/abhi.component';
import { CategoriesComponent } from './categories/categories.component';
import { SearchComponent } from './search/search.component';
import { SourcesComponent } from './sources/sources.component';
import { RouterModule } from '@angular/router';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    CountriesComponent,
    AbhiComponent,
    CategoriesComponent,
    
    SearchComponent,
    SourcesComponent
    
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path:"abhi",component: AbhiComponent},
      {path:"countries",component: CountriesComponent},
      {path:"categories",component: CategoriesComponent},
    
      {path:"search",component: SearchComponent},
      {path:"sources",component: SourcesComponent}
    
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
