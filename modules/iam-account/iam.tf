data "aws_caller_identity" "this" {
  count = 1
}

resource "aws_iam_account_alias" "this" {
  account_alias = var.account_alias
}

resource "aws_iam_account_password_policy" "this" {
  count = 1
  max_password_age               = var.max_password_age
  minimum_password_length        = var.minimum_password_length
  require_numbers                = var.require_numbers
  require_symbols                = var.require_symbols
}