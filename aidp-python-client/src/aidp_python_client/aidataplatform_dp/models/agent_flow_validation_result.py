# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentFlowValidationResult(object):
    """
    Result of validating an Agent Flow diagram.
    """

    #: A constant which can be used with the validation_level property of a AgentFlowValidationResult.
    #: This constant has a value of "BASIC"
    VALIDATION_LEVEL_BASIC = "BASIC"

    #: A constant which can be used with the validation_level property of a AgentFlowValidationResult.
    #: This constant has a value of "DEEP"
    VALIDATION_LEVEL_DEEP = "DEEP"

    def __init__(self, **kwargs):
        """
        Initializes a new AgentFlowValidationResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param is_valid:
            The value to assign to the is_valid property of this AgentFlowValidationResult.
        :type is_valid: bool

        :param validation_level:
            The value to assign to the validation_level property of this AgentFlowValidationResult.
            Allowed values for this property are: "BASIC", "DEEP"
        :type validation_level: str

        :param summary:
            The value to assign to the summary property of this AgentFlowValidationResult.
        :type summary: oci.aidataplatform_dp.models.AgentFlowValidationSummary

        :param issues:
            The value to assign to the issues property of this AgentFlowValidationResult.
        :type issues: list[oci.aidataplatform_dp.models.AgentFlowValidationIssue]

        :param metadata:
            The value to assign to the metadata property of this AgentFlowValidationResult.
        :type metadata: oci.aidataplatform_dp.models.AgentFlowValidationMetadata

        """
        self.swagger_types = {
            'is_valid': 'bool',
            'validation_level': 'str',
            'summary': 'AgentFlowValidationSummary',
            'issues': 'list[AgentFlowValidationIssue]',
            'metadata': 'AgentFlowValidationMetadata'
        }

        self.attribute_map = {
            'is_valid': 'isValid',
            'validation_level': 'validationLevel',
            'summary': 'summary',
            'issues': 'issues',
            'metadata': 'metadata'
        }

        self._is_valid = None
        self._validation_level = None
        self._summary = None
        self._issues = None
        self._metadata = None

    @property
    def is_valid(self):
        """
        **[Required]** Gets the is_valid of this AgentFlowValidationResult.
        True when the diagram has no error severity validation issues.


        :return: The is_valid of this AgentFlowValidationResult.
        :rtype: bool
        """
        return self._is_valid

    @is_valid.setter
    def is_valid(self, is_valid):
        """
        Sets the is_valid of this AgentFlowValidationResult.
        True when the diagram has no error severity validation issues.


        :param is_valid: The is_valid of this AgentFlowValidationResult.
        :type: bool
        """
        self._is_valid = is_valid

    @property
    def validation_level(self):
        """
        **[Required]** Gets the validation_level of this AgentFlowValidationResult.
        Highest validation level completed.

        Allowed values for this property are: "BASIC", "DEEP"


        :return: The validation_level of this AgentFlowValidationResult.
        :rtype: str
        """
        return self._validation_level

    @validation_level.setter
    def validation_level(self, validation_level):
        """
        Sets the validation_level of this AgentFlowValidationResult.
        Highest validation level completed.


        :param validation_level: The validation_level of this AgentFlowValidationResult.
        :type: str
        """
        allowed_values = ["BASIC", "DEEP"]
        if not value_allowed_none_or_none_sentinel(validation_level, allowed_values):
            raise ValueError(
                "Invalid value for `validation_level`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._validation_level = validation_level

    @property
    def summary(self):
        """
        Gets the summary of this AgentFlowValidationResult.

        :return: The summary of this AgentFlowValidationResult.
        :rtype: oci.aidataplatform_dp.models.AgentFlowValidationSummary
        """
        return self._summary

    @summary.setter
    def summary(self, summary):
        """
        Sets the summary of this AgentFlowValidationResult.

        :param summary: The summary of this AgentFlowValidationResult.
        :type: oci.aidataplatform_dp.models.AgentFlowValidationSummary
        """
        self._summary = summary

    @property
    def issues(self):
        """
        Gets the issues of this AgentFlowValidationResult.
        Ordered validation issue list.


        :return: The issues of this AgentFlowValidationResult.
        :rtype: list[oci.aidataplatform_dp.models.AgentFlowValidationIssue]
        """
        return self._issues

    @issues.setter
    def issues(self, issues):
        """
        Sets the issues of this AgentFlowValidationResult.
        Ordered validation issue list.


        :param issues: The issues of this AgentFlowValidationResult.
        :type: list[oci.aidataplatform_dp.models.AgentFlowValidationIssue]
        """
        self._issues = issues

    @property
    def metadata(self):
        """
        Gets the metadata of this AgentFlowValidationResult.

        :return: The metadata of this AgentFlowValidationResult.
        :rtype: oci.aidataplatform_dp.models.AgentFlowValidationMetadata
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata):
        """
        Sets the metadata of this AgentFlowValidationResult.

        :param metadata: The metadata of this AgentFlowValidationResult.
        :type: oci.aidataplatform_dp.models.AgentFlowValidationMetadata
        """
        self._metadata = metadata

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
