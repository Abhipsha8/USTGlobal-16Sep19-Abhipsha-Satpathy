import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';
import { NavbarComponent } from './navbar/navbar.component';
import { RouterModule } from '@angular/router';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { FooterComponent } from './footer/footer.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { TwoWayBindingComponent } from './data-binding/two-way-binding/two-way-binding.component';
import { DirectivesComponent } from './directives/directives.component';
import { StructuralDirectivesComponent } from './directives/structural-directives/structural-directives.component';
import { NgIfComponent } from './directives/structural-directives/ng-if/ng-if.component';
import { NgForComponent } from './directives/structural-directives/ng-for/ng-for.component';
import { NgSwitchComponent } from './directives/structural-directives/ng-switch/ng-switch.component';
import { FormvalidationComponent } from './formvalidation/formvalidation.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { TechElevateComponent } from './tech-elevate/tech-elevate.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { HttpClient } from 'selenium-webdriver/http';
import { DollorPipe } from './dollor.pipe';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    NavbarComponent,
    HelpComponent,
    RegisterComponent,
    LoginComponent,
    NavbarComponent,
    FooterComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayBindingComponent,
    DirectivesComponent,
    StructuralDirectivesComponent,
    NgIfComponent,
    NgForComponent,
    NgSwitchComponent,
    FormvalidationComponent,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
    TechElevateComponent,
    CommentComponent,
    CommentDetailsComponent,
    DollorPipe,
      ],
  imports: [
   BrowserModule,
   FormsModule,
   ReactiveFormsModule,
   HttpClientModule,
    RouterModule.forRoot([
      {path: 'home', component: HomeComponent},
      {path: 'about', component: AboutComponent},
      {path: 'help', component: HelpComponent},
      {path: 'ng-if', component: NgIfComponent},
      {path: 'ng-for', component: NgForComponent},
      {path: 'ng-switch', component: NgSwitchComponent},
      {path: 'register', component: RegisterComponent},
      {path: 'property-binding', component: PropertyBindingComponent},
      {path: 'event-binding', component: EventBindingComponent},
      {path: 'two-way-binding', component: TwoWayBindingComponent},
      {path: 'form', component: FormvalidationComponent},
      {path: 'reactive-form', component: ReactiveFormComponent},
      {path: 'parent', component: ParentComponent},
      {path: 'comment-details', component: CommentDetailsComponent}




    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
