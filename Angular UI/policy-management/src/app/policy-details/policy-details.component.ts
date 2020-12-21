import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params, Router } from '@angular/router';
import { CustomerServiceService } from '../customer-service.service';

@Component({
  selector: 'app-policy-details',
  templateUrl: './policy-details.component.html',
  styleUrls: ['./policy-details.component.css']
})
export class PolicyDetailsComponent  {
AvailablePolicy : any = undefined;
userpolicies : any = undefined;
FirstName : string = "";

constructor(private _service : CustomerServiceService, private _activatedRoute : ActivatedRoute, private _router : Router){}

ngOnInit() : void {
  this._activatedRoute.params.subscribe((key : Params) => this.FirstName = key.firstname);
}

refresh() : void {
  this._service.fetchAllPolicies()
  .subscribe(response => this.AvailablePolicy = response);
}

handleClick() : void {
  this._service.fetchUserPolicies(this.FirstName)
  .subscribe(response => { console.log(response); this.userpolicies = response});
}

handleLog() : void {
  this._router.navigate(["login"]);
}
  
}
