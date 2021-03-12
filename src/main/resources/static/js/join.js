	$(".key").on("keyup", function (event) {
			if (event.keyCode != 13) {
				if (this.value) {
					$(this).nextAll(".keyShow").css("display", "inline-block");
				} else {

					$(this).nextAll(".keyShow").hide();
				}
			}
		});

		$(".keyShow").on("click", function () {
			if ($(this).prevAll(".key").attr("type") == "password") {
				$(this).prevAll(".key").attr("type", "text");
				$($(this)).text("H I D E");
			} else {
				$(this).prevAll(".key").attr("type", "password");
				$($(this)).text("SHOW");
			}
		});