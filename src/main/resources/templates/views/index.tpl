layout 'layout.tpl', title: 'Sample Session GemFire',
content: contents {
	
	p (class:'bg-info','MESSAGE from Spring Model/View: ' + msg)
	p (class:'bg-success','SESSION ID: ' + spring.request.session.id)
	
	table(class:'table table-striped') {
		tr {
			th 'KEY'
			th 'VALUE'
		}
		spring.request.session.attributeNames.each { row->
			tr{
				td row
				td spring.request.session.getAttribute(row)
			}
		}
	}
}