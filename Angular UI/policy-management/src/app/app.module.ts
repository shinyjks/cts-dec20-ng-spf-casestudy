import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { FormsModule } from '@angular/forms';
import { Routes, RouterModule} from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { LoginFormComponent } from './login-form/login-form.component';
import { PolicyDetailsComponent } from './policy-details/policy-details.component';
  
let routes : Routes = [
  {path:"", component : LoginFormComponent},
  {path : "register", component : RegisterComponent},
  {path : "login", component : LoginFormComponent},
  {path : "policydetails/:firstname", component : PolicyDetailsComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    LoginFormComponent,
    PolicyDetailsComponent,
    
  ],
  imports: [
    BrowserModule, FormsModule, HttpClientModule, RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
