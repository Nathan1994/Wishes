// function validate_required(field,alerttxt)
// {
// with (field)
//   {
//   if (value==null||value=="")
//     {alert(alerttxt);return false}
//   else {return true}
//   }
// }

// function validate_form_required(thisform)
// {
// with (thisform)
//   {
//   if (validate_required(user.email,"Email must be filled out!")==false)
//     {email.focus();return false}
//   }
// }




// function validate_email(field,alerttxt)
// {
// with (field)
// {
// apos=value.indexOf("@")
// dotpos=value.lastIndexOf(".")
// if (apos<1||dotpos-apos<2) {
//   	alert(alerttxt);
//   	return false
//   }
// else {
// 	return true
// 	}
//   }
// }

// function validate_form_email(thisform)
// {
// with (thisform)
// {
// if (
// 	validate_email(useremail,"请输入正确的邮箱格式!")==false)
//   {email.focus();return false}
// }
// }



function repeat(p1,p2,alerttxt){

	if (p1.value!=p2.value) {
		alert(alerttxt);
		return false
		}
	else {
		return true
	}
}

function validate_form_repeat()
{
	// with(thisform){
	// with(a)
	{
		var name1=document.getElementsByName("userDTO.password")[0];
		var name2=document.getElementsByName("userDTO.passwordConfirming")[0];
		if (repeat(name1,name2,"请确保两次密码输入一致！")==false) {
			password.focus();return false
		}
	// }
	// }
}
}