
module.exports = class Board {
    constructor(cells) {
        this.cells = cells;
    }
    get Cells() {
        return this.cells;
    }
      
 getBoardMarks(){
     var mark  = new Array(2)
    for (var index = 0; index < 3; index++) {
        mark[index] = new Array(2)
    }
    for (var index = 0; index < 3; index++) {
        for (index1 = 0; index1 < 3; index1++) {
            mark[index][index1] = this.cells[index][index1].getMark();
        }
    }
       return mark;
 }
 getCelltoMark(index,index1,mark){
   var suceess = this.cells[index][index1].addMark(mark) 
          return suceess
 }
     
}