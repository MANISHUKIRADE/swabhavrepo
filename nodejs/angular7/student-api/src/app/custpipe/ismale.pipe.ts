import { Pipe, PipeTransform } from '@angular/core';
@Pipe({
    name: 'genderfilter'
})
export class genderfilter implements PipeTransform {
transform(gender:boolean){
    if(gender==true){
        return "Male"
    }else{
        return "Female"
    }

}
}