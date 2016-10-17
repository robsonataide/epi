

app.userEvents.verifyHasEmpresa = function(ds) {
	if(ds.data.length == 0){
	  ds.startInserting();
	}
	return true;
}