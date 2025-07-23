import http from "k6/http";

export const options = {
  iterations: 1,
};

export default function () {
  const response = http.get("http://localhost:8080/products");
}
