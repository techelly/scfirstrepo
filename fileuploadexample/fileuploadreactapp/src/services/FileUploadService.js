import http from "../http-common";

const upload = (file, onUploadProgress) => {
  let formData = new FormData();

  formData.append("file", file);
  formData.append("cust_id",15);  
  
  return http.post("/upload", formData, {
    headers: {
      "Content-Type": "multipart/form-data",
    },
    onUploadProgress,
  });
};

const getFiles = () => {
  return http.get("/files");
};

const FileUploadService = {
  upload,
  getFiles,
};

export default FileUploadService;