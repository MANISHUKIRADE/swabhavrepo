import { Injectable } from "@angular/core";
import { HttpClient } from '@angular/common/http';




@Injectable({
    providedIn: 'root',
})
export class httpNumService {
    constructor(
        private http: HttpClient
    ) { }

    getResult(val): Promise<any> {
        return new Promise((resolve, reject) => {
            this.http.get("http://numbersapi.com" + "/" + val, { responseType: 'text' })
                .toPromise()
                .then((response) => {
                    console.log("success " + response);
                    resolve(response);
                })
                .catch((err) => {
                    reject(err)
                })
        })


    }
}
