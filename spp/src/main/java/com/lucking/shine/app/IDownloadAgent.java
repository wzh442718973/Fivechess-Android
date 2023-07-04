package com.lucking.shine.app;

//insert class

public interface IDownloadAgent {
	void onDownloadStart();

	void onDownloadProgress(int progress);

	void onDownloadFinish();
}
