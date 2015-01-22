$(document).ready(function(){
    $('textarea').autosize({
        append: false,
        placeholder: true});

    $('.idea .show').click(function(e) {
        var showElement = $(e.target);
        if(!showElement.hasClass('show')) {
            showElement = showElement.parents('.show');
        }
        var editElement = showElement.parent().children('.edit');
        var ideaElement = showElement.parent();
        showElement.hide();
        editElement.show();

        var desShow = showElement.find('.description');
        var desTextarea = editElement.find('textarea.description');

        desTextarea.trigger('autosize.resize');
        desTextarea.focus();
    });

    $('.idea').hover(function(e) {
        var ideaElement = $(e.target);
        if(!ideaElement.hasClass('idea')) {
            ideaElement = ideaElement.parents('.idea');
        }
        if(ideaElement.hasClass('newidea')) { return; }
        console.log(ideaElement.find('.editButton'));
        ideaElement.find('.saveButton').show();
        ideaElement.find('.editButton').show();
        ideaElement.find('.deleteButton').show();
    }, function(e) {
        var ideaElement = $(e.target);
        if(!ideaElement.hasClass('idea')) {
            ideaElement = ideaElement.parents('.idea');
        }
        if(ideaElement.hasClass('newidea')) { return; }
        ideaElement.find('.saveButton').hide();
        ideaElement.find('.editButton').hide();
        ideaElement.find('.deleteButton').hide();
    });

    $('.newidea .edit').show();
    $('.newidea .saveButton').show();
});
