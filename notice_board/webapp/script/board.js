function boardCheck() {
	if (document.frn.name.value.length == 0) {
		alert("작성자를 입력하세요.")
		return false;
	}
	if (document.frn.name.pass.length == 0) {
		alert("비밀번호를 입력하세요.")
		return false;
	}
	if (document.frn.title.pass.length == 0) {
		alert("제목을 입력하세요.")
		return false;
	}
	return true;
}


function open_win(url, name) {
	window.open(url, name, "width = 500, height=230");
}

function passCheck() {
	if (document.frn.name.pass.length == 0) {
		alert("비밀번호를 입력하세요.")
		return false;
	}
	return true;
}
