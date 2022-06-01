resource "aws_iam_user" "new_user" {
  name = var.name
}



resource "aws_iam_role" "role" {
  name                 = var.role_name
  path                 = var.role_path
  description          = var.role_description

  assume_role_policy = <<EOF
{
  "Version": "2012-10-17",
  "Statement": [
    {
      "Action": "sts:AssumeRole",
      "Principal": {
        "Service": "ec2.amazonaws.com"
      },
      "Effect": "Allow",
      "Sid": ""
    }
  ]
}
EOF
}


# data "aws_iam_policy_document" "example" {
#   statement {
#     actions   = ["s3:ListAllMyBuckets"]
#     resources = ["arn:aws:s3:::*"]
#     effect = "Allow"
#   }
#   statement {
#     actions   = ["s3:*"]
#     resources = [aws_s3_bucket.bucket.arn]
#     effect = "Allow"
#   }
# }


resource "aws_iam_role_policy_attachment" "attaching_test" {
  role       = aws_iam_role.role.name
  policy_arn = var.attaching_test_role_policy_arn
}