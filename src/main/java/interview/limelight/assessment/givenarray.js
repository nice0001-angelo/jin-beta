function isTrue(numbers, number){
	if(numbers.length < 0 || number.length > 100000){ 
		alert("Input valid array");
		} else{
			for(var i=0; i<numbers.length; i++){
				for(var k=i+1; k<numbers.length-1; k++){
					if(number == numbers[i]+numbers[k]) return true;
				}
			}
			return false;
		}
}