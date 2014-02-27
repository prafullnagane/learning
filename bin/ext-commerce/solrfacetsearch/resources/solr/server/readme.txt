In order to enable multiple-core mode, rename the templatesolr.xml to solr.xml and restart the standalone solr server.
In multiple-core mode it is possible to index multiple types - each one in a separate index.
Please, be aware, that after switching to multiple-core mode, the indexes created while operating in standard mode will no longer be reachable either from solr admin console or by solrfacetsearch extension.

