import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerServiceService {

  constructor(private _http : HttpClient) { }

  save(formValues : any) : Observable<any>{
    let uri = "http://localhost:8084/policy-management/spring/api/save";
    return this._http.post(uri, formValues);
  }
  authenticate(FirstName : string, Password : string) : Observable<any>{
    let uri = `http://localhost:8084/policy-management/spring/api/${FirstName}/${Password}`;
    return this._http.post(uri, {});
  }

  fetchAllPolicies() : Observable<any>{
    let uri = "http://localhost:8084/policy-management/spring/api/policy";
    return this._http.get(uri);
  }
  fetchUserPolicies(FirstName : string) : Observable<any>{
    let uri = `http://localhost:8084/policy-management/spring/api/${FirstName}`;
    return this._http.get(uri);
  }
}
