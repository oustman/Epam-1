resource "aws_iam_policy" "policy" {
  name        =  var.name
  path        = var.path
  description = var.description
  tags = var.tags

  # Terraform's "jsonencode" function converts a
  # Terraform expression result to valid JSON syntax.
  policy = var.policy
}