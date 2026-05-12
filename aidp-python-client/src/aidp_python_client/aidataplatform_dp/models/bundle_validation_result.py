# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class BundleValidationResult(object):
    """
    Result of validating bundle structure/resources. Contains status and lists of error or warning messages.
    """

    #: A constant which can be used with the status property of a BundleValidationResult.
    #: This constant has a value of "VALID"
    STATUS_VALID = "VALID"

    #: A constant which can be used with the status property of a BundleValidationResult.
    #: This constant has a value of "INVALID"
    STATUS_INVALID = "INVALID"

    #: A constant which can be used with the status property of a BundleValidationResult.
    #: This constant has a value of "WARNINGS"
    STATUS_WARNINGS = "WARNINGS"

    def __init__(self, **kwargs):
        """
        Initializes a new BundleValidationResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param status:
            The value to assign to the status property of this BundleValidationResult.
            Allowed values for this property are: "VALID", "INVALID", "WARNINGS"
        :type status: str

        :param errors:
            The value to assign to the errors property of this BundleValidationResult.
        :type errors: list[str]

        :param warnings:
            The value to assign to the warnings property of this BundleValidationResult.
        :type warnings: list[str]

        """
        self.swagger_types = {
            'status': 'str',
            'errors': 'list[str]',
            'warnings': 'list[str]'
        }

        self.attribute_map = {
            'status': 'status',
            'errors': 'errors',
            'warnings': 'warnings'
        }

        self._status = None
        self._errors = None
        self._warnings = None

    @property
    def status(self):
        """
        **[Required]** Gets the status of this BundleValidationResult.
        Validation status.

        Allowed values for this property are: "VALID", "INVALID", "WARNINGS"


        :return: The status of this BundleValidationResult.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this BundleValidationResult.
        Validation status.


        :param status: The status of this BundleValidationResult.
        :type: str
        """
        allowed_values = ["VALID", "INVALID", "WARNINGS"]
        if not value_allowed_none_or_none_sentinel(status, allowed_values):
            raise ValueError(
                "Invalid value for `status`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._status = status

    @property
    def errors(self):
        """
        Gets the errors of this BundleValidationResult.
        List of validation error messages.


        :return: The errors of this BundleValidationResult.
        :rtype: list[str]
        """
        return self._errors

    @errors.setter
    def errors(self, errors):
        """
        Sets the errors of this BundleValidationResult.
        List of validation error messages.


        :param errors: The errors of this BundleValidationResult.
        :type: list[str]
        """
        self._errors = errors

    @property
    def warnings(self):
        """
        Gets the warnings of this BundleValidationResult.
        List of validation warning messages.


        :return: The warnings of this BundleValidationResult.
        :rtype: list[str]
        """
        return self._warnings

    @warnings.setter
    def warnings(self, warnings):
        """
        Sets the warnings of this BundleValidationResult.
        List of validation warning messages.


        :param warnings: The warnings of this BundleValidationResult.
        :type: list[str]
        """
        self._warnings = warnings

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
