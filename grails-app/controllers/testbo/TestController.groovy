package testbo

import grails.converters.JSON
import org.grails.web.json.JSONObject


class TestController {
	
	def randService
	
	def index() { 
		
		String myuser = randService.randomise('username')
		[myuser:myuser]
	}
	def index2() { }
	
	
	def definedselectvalues() { }
	def definedselectvalues2() {
		String myuser = randService.randomise('username')
		[myuser:myuser]
	}
	def definedselectvalues3() { }
	
	def norefprimary() { }
	def norefselectionext() {}
	def noref() { }
	
	def multidomainexample() { }
	def multimultidomainexample() {
		String myuser = randService.randomise('username2')
		[myuser:myuser]
		
	}
	
	def autoCompleteToSelect() {
		String myuser = randService.randomise('username')
		[myuser:myuser]
		
	}
	def autoCompleteToSelect2() {
		String myuser = randService.randomise('username')
		[myuser:myuser]
		
	}
	def autoComplete() { 
		String myuser = randService.randomise('username')
		[myuser:myuser]
		
	}
	
	def selectautoComplete() {
		String myuser = randService.randomise('username')
		[myuser:myuser]
		
	}
	
	
	
	def example5() {
	
		
		String cName, cId, text2, cuId,cuName,conId,conName
		if (params.MyCity11) {
			JSONObject myCity=JSON?.parse(params.MyCity11)
			if (myCity) {
			cId = myCity?.get('selected')
			cName = myCity?.get('selectedText')
			}
		}
		
		if (params.MyCountry11) { 
			
				JSONObject MyCountry11=JSON?.parse(params.MyCountry11)
				if (MyCountry11) {
				cuId = MyCountry11?.get('selected')
				cuName = MyCountry11?.get('selectedText')
				}
		}
		
		if (params.MyContinent2) {
			JSONObject MyContinent2=JSON?.parse(params.MyContinent2)
			if (MyContinent2) {
			conId = MyContinent2?.get('selected')
			conName = MyContinent2?.get('selectedText')
			}
		}
		
		
		text2 = "\nJSON PARSED<br/> MyCity11 had id of >${cId}< and and of >${cName}<\n<br/>"
		text2 += "MyCountry11 id: "+cuId+"----> Name:"+cuName+"<br/>"
		text2 += "MyContinent2 id: "+conId+"----> NAME: "+conName+"<br/>"
		text2 +="Params are:<br>"
		render text2+params

	}
}
