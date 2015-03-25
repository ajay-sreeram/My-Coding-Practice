



















































function getCounterParams(dictName, entryId, isSearch, turnawayId) {
    var params = 'authsessionid=$session.getId()';
    if (dictName)
        params += '&source_title_name=' + dictName;
    if (entryId) {
        params += '&event_type=dictionary_entry';
        params += '&content_id=' + entryId;
    }
    if (isSearch)
        params += '&event_type=search';
    if (turnawayId)
        params += '&turnaway_id=' + turnawayId;
        return params;
}
