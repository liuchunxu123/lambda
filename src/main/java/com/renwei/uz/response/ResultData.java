package com.renwei.uz.response;

/**.
 * @param <T>
 * @author Administrator
 */
public class ResultData<T> {

	public int code;

	private String msg;

	private T data;

	public int getCode() {
		return code;
	}


	public ResultData<T> setCode(ResultCode resultCode) {
		this.code = resultCode.code;
		return this;
	}
	
	public ResultData<T> setCode(int resultCode) {
		this.code =resultCode;
		return this;
	}

	public String getMsg() {
		return msg;
	}

	public ResultData<T> setMsg(String msg) {
		this.msg = msg;
		return this;
	}

	public T getData() {
		return data;
	}

	public ResultData<T> setData(T data) {
		this.data = data;
		return this;
	}

}
