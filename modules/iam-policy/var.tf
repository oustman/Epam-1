variable "name" {
  description = "Desired name for the IAM policy"
  type        = string
}

variable "path" {
  description = "Desired path for the IAM path"
  type        = string
}
variable "description" {
  description = "Desired expainatation for the IAM description"
  type        = string
}
variable "tags" {
  description = "A map of tags to add to all resources."
  type        = map(string)
  default     = {}
}
variable "policy" {
  description = "The path of the policy in IAM (tpl file)"
  type        = string
  default     = ""
}