


variable "max_session_duration" {
  description = "Maximum CLI/API session duration in seconds between 3600 and 43200"
  type        = number
  default     = 3600
}


variable "name" {
  description = "IAM User name"
  type        = string
  default     = ""
}



variable "role_name" {
  description = "IAM role name"
  type        = string
  default     = ""
}

variable "role_path" {
  description = "Path of IAM role"
  type        = string
  default     = "/"
}



variable "tags" {
  description = "A map of tags to add to IAM role resources"
  type        = map(string)
  default     = {}
}






# Pre-defined policies
variable "attaching_test_role_policy_arn" {
  description = "Policy ARN to use for readonly role"
  type        = string
  default     = "arn:aws:iam::aws:policy/ReadOnlyAccess"
}
  






variable "attach_attaching_test_policy" {
  description = "Whether to attach an admin policy to a role"
  type        = bool
  default     = false
}



variable "role_description" {
  description = "IAM Role description"
  type        = string
  default     = ""
}
