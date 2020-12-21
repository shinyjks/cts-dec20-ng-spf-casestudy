import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerServiceService } from '../customer-service.service';



@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent  {

  FirstName : string = "";
  LastName : string  = "";
  Dob : Date | undefined = undefined;
  Address : string = "";
  ContactNumber : string = "";
  Email : string ="";
  Password : string = "";
  Cnf_Password : string = "";

  message : string | undefined = undefined;

  constructor( private _service : CustomerServiceService,
    private _router : Router
    ) { }
 
  
register(formValues : any){
  let registered =  this._service.save(formValues)
  .subscribe(response => {console.log(response); this.message = 'Stored' + response.FirstName;
  if(registered){
    this._router.navigate(["policydetails",response.FirstName]);
  }
});
}
}
