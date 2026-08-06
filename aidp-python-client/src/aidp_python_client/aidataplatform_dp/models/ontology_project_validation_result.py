# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyProjectValidationResult(object):
    """
    Result returned by OT SDK project.validate for an ontology project.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyProjectValidationResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param project_id:
            The value to assign to the project_id property of this OntologyProjectValidationResult.
        :type project_id: str

        :param valid:
            The value to assign to the valid property of this OntologyProjectValidationResult.
        :type valid: bool

        :param operation:
            The value to assign to the operation property of this OntologyProjectValidationResult.
        :type operation: str

        :param validation_report:
            The value to assign to the validation_report property of this OntologyProjectValidationResult.
        :type validation_report: str

        :param error_code:
            The value to assign to the error_code property of this OntologyProjectValidationResult.
        :type error_code: str

        :param error_message:
            The value to assign to the error_message property of this OntologyProjectValidationResult.
        :type error_message: str

        """
        self.swagger_types = {
            'project_id': 'str',
            'valid': 'bool',
            'operation': 'str',
            'validation_report': 'str',
            'error_code': 'str',
            'error_message': 'str'
        }

        self.attribute_map = {
            'project_id': 'projectId',
            'valid': 'valid',
            'operation': 'operation',
            'validation_report': 'validationReport',
            'error_code': 'errorCode',
            'error_message': 'errorMessage'
        }

        self._project_id = None
        self._valid = None
        self._operation = None
        self._validation_report = None
        self._error_code = None
        self._error_message = None

    @property
    def project_id(self):
        """
        **[Required]** Gets the project_id of this OntologyProjectValidationResult.
        Ontology Manager project identifier that was validated.


        :return: The project_id of this OntologyProjectValidationResult.
        :rtype: str
        """
        return self._project_id

    @project_id.setter
    def project_id(self, project_id):
        """
        Sets the project_id of this OntologyProjectValidationResult.
        Ontology Manager project identifier that was validated.


        :param project_id: The project_id of this OntologyProjectValidationResult.
        :type: str
        """
        self._project_id = project_id

    @property
    def valid(self):
        """
        **[Required]** Gets the valid of this OntologyProjectValidationResult.
        Whether OT SDK validation accepted the project.


        :return: The valid of this OntologyProjectValidationResult.
        :rtype: bool
        """
        return self._valid

    @valid.setter
    def valid(self, valid):
        """
        Sets the valid of this OntologyProjectValidationResult.
        Whether OT SDK validation accepted the project.


        :param valid: The valid of this OntologyProjectValidationResult.
        :type: bool
        """
        self._valid = valid

    @property
    def operation(self):
        """
        Gets the operation of this OntologyProjectValidationResult.
        OT SDK operation name.


        :return: The operation of this OntologyProjectValidationResult.
        :rtype: str
        """
        return self._operation

    @operation.setter
    def operation(self, operation):
        """
        Sets the operation of this OntologyProjectValidationResult.
        OT SDK operation name.


        :param operation: The operation of this OntologyProjectValidationResult.
        :type: str
        """
        self._operation = operation

    @property
    def validation_report(self):
        """
        Gets the validation_report of this OntologyProjectValidationResult.
        JSON validation result or error details returned by OT SDK.


        :return: The validation_report of this OntologyProjectValidationResult.
        :rtype: str
        """
        return self._validation_report

    @validation_report.setter
    def validation_report(self, validation_report):
        """
        Sets the validation_report of this OntologyProjectValidationResult.
        JSON validation result or error details returned by OT SDK.


        :param validation_report: The validation_report of this OntologyProjectValidationResult.
        :type: str
        """
        self._validation_report = validation_report

    @property
    def error_code(self):
        """
        Gets the error_code of this OntologyProjectValidationResult.
        OT SDK validation error code when validation fails.


        :return: The error_code of this OntologyProjectValidationResult.
        :rtype: str
        """
        return self._error_code

    @error_code.setter
    def error_code(self, error_code):
        """
        Sets the error_code of this OntologyProjectValidationResult.
        OT SDK validation error code when validation fails.


        :param error_code: The error_code of this OntologyProjectValidationResult.
        :type: str
        """
        self._error_code = error_code

    @property
    def error_message(self):
        """
        Gets the error_message of this OntologyProjectValidationResult.
        OT SDK validation error message when validation fails.


        :return: The error_message of this OntologyProjectValidationResult.
        :rtype: str
        """
        return self._error_message

    @error_message.setter
    def error_message(self, error_message):
        """
        Sets the error_message of this OntologyProjectValidationResult.
        OT SDK validation error message when validation fails.


        :param error_message: The error_message of this OntologyProjectValidationResult.
        :type: str
        """
        self._error_message = error_message

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
