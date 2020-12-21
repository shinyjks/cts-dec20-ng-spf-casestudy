import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerServiceService } from '../customer-service.service';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent {

 FirstName : string | undefined = undefined;
 Password : string | undefined = undefined;

 message : string | undefined = undefined;
  
 constructor(private _service : CustomerServiceService, private _router : Router){}

 handleLogin(loginValues : any){
  this._service
    .authenticate(loginValues.FirstName, loginValues.Password)
    .subscribe(response => {
      console.log(response); 
      if(response != undefined)
        this._router.navigate(["policydetails",loginValues.FirstName]);
    });


   }
 }

