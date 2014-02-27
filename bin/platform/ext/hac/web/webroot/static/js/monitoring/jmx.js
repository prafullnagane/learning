var beanTable;

$(document).ready(
		function() {
			beanTable = $('#beans').dataTable({
				"bPaginate" : false,
				"bStateSave" : true,
				"bFilter" : false,
				"aaSorting" : [ [ 0, "asc" ] ],
				"aoColumnDefs": [ { "bSortable": false, "aTargets": [ 3 ] } ],
				"bInfo" : false
			});

			$("input[type=checkbox]").live(
					"change",
					function(e) {
						var url = $('#beans').attr('data-toggleUrl') + encodeURIComponent(e.currentTarget.id);
								+ encodeURIComponent(e.currentTarget.id);
						$.ajax({
							url : url,
							type : 'POST',
							cache:false,
							headers : {
								'Accept' : 'application/json'
							},
							success : function(data) {
								rebuildBeansTable(data);
							},
							error : hac.global.err
						});

					});

			getData();

		});

function getData() {
	var url = $('#beans').attr('data-url');
	$.ajax({
		url : url,
		type : 'GET',
		cache : false,
		headers : {
			'Accept' : 'application/json'
		},
		success : function(data) {
			rebuildBeansTable(data);
		},
		error : hac.global.err
	});

}

function rebuildBeansTable(data) {
	beanTable.fnClearTable();

	for (pos in data) {
		var bean = data[pos];
		beanTable.fnAddData([ bean.key, bean.domain, bean.objectName,
				getToggleButton(bean.registered, bean.key) ]);
	}
	
	$('input[type=checkbox]').iphoneStyle();
}

function getToggleButton(registered, id) {
	return '<input type="checkbox" id="' + id + '" '+ ((registered) ? 'checked' : '') +'/>';
}