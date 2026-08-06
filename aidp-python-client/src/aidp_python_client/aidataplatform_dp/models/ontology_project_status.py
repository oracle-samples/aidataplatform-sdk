# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyProjectStatus(object):
    """
    Status history row for an ontology project, including publish lifecycle records.
    """

    #: A constant which can be used with the status property of a OntologyProjectStatus.
    #: This constant has a value of "CREATED"
    STATUS_CREATED = "CREATED"

    #: A constant which can be used with the status property of a OntologyProjectStatus.
    #: This constant has a value of "UPDATED"
    STATUS_UPDATED = "UPDATED"

    #: A constant which can be used with the status property of a OntologyProjectStatus.
    #: This constant has a value of "VALIDATING"
    STATUS_VALIDATING = "VALIDATING"

    #: A constant which can be used with the status property of a OntologyProjectStatus.
    #: This constant has a value of "VALIDATION_FAILED"
    STATUS_VALIDATION_FAILED = "VALIDATION_FAILED"

    #: A constant which can be used with the status property of a OntologyProjectStatus.
    #: This constant has a value of "PUBLISHING"
    STATUS_PUBLISHING = "PUBLISHING"

    #: A constant which can be used with the status property of a OntologyProjectStatus.
    #: This constant has a value of "PUBLISHED"
    STATUS_PUBLISHED = "PUBLISHED"

    #: A constant which can be used with the status property of a OntologyProjectStatus.
    #: This constant has a value of "PUBLISH_FAILED"
    STATUS_PUBLISH_FAILED = "PUBLISH_FAILED"

    #: A constant which can be used with the status property of a OntologyProjectStatus.
    #: This constant has a value of "UNPUBLISHING"
    STATUS_UNPUBLISHING = "UNPUBLISHING"

    #: A constant which can be used with the status property of a OntologyProjectStatus.
    #: This constant has a value of "UNPUBLISHED"
    STATUS_UNPUBLISHED = "UNPUBLISHED"

    #: A constant which can be used with the status property of a OntologyProjectStatus.
    #: This constant has a value of "UNPUBLISH_FAILED"
    STATUS_UNPUBLISH_FAILED = "UNPUBLISH_FAILED"

    #: A constant which can be used with the status property of a OntologyProjectStatus.
    #: This constant has a value of "ARCHIVED"
    STATUS_ARCHIVED = "ARCHIVED"

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyProjectStatus object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param status_id:
            The value to assign to the status_id property of this OntologyProjectStatus.
        :type status_id: str

        :param project_id:
            The value to assign to the project_id property of this OntologyProjectStatus.
        :type project_id: str

        :param project_version:
            The value to assign to the project_version property of this OntologyProjectStatus.
        :type project_version: int

        :param publish_version:
            The value to assign to the publish_version property of this OntologyProjectStatus.
        :type publish_version: int

        :param status:
            The value to assign to the status property of this OntologyProjectStatus.
            Allowed values for this property are: "CREATED", "UPDATED", "VALIDATING", "VALIDATION_FAILED", "PUBLISHING", "PUBLISHED", "PUBLISH_FAILED", "UNPUBLISHING", "UNPUBLISHED", "UNPUBLISH_FAILED", "ARCHIVED"
        :type status: str

        :param comment:
            The value to assign to the comment property of this OntologyProjectStatus.
        :type comment: str

        :param validation_report:
            The value to assign to the validation_report property of this OntologyProjectStatus.
        :type validation_report: str

        :param compiled_artifact_ref:
            The value to assign to the compiled_artifact_ref property of this OntologyProjectStatus.
        :type compiled_artifact_ref: str

        :param error_message:
            The value to assign to the error_message property of this OntologyProjectStatus.
        :type error_message: str

        :param idempotency_key:
            The value to assign to the idempotency_key property of this OntologyProjectStatus.
        :type idempotency_key: str

        :param time_created:
            The value to assign to the time_created property of this OntologyProjectStatus.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this OntologyProjectStatus.
        :type time_updated: datetime

        """
        self.swagger_types = {
            'status_id': 'str',
            'project_id': 'str',
            'project_version': 'int',
            'publish_version': 'int',
            'status': 'str',
            'comment': 'str',
            'validation_report': 'str',
            'compiled_artifact_ref': 'str',
            'error_message': 'str',
            'idempotency_key': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime'
        }

        self.attribute_map = {
            'status_id': 'statusId',
            'project_id': 'projectId',
            'project_version': 'projectVersion',
            'publish_version': 'publishVersion',
            'status': 'status',
            'comment': 'comment',
            'validation_report': 'validationReport',
            'compiled_artifact_ref': 'compiledArtifactRef',
            'error_message': 'errorMessage',
            'idempotency_key': 'idempotencyKey',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated'
        }

        self._status_id = None
        self._project_id = None
        self._project_version = None
        self._publish_version = None
        self._status = None
        self._comment = None
        self._validation_report = None
        self._compiled_artifact_ref = None
        self._error_message = None
        self._idempotency_key = None
        self._time_created = None
        self._time_updated = None

    @property
    def status_id(self):
        """
        **[Required]** Gets the status_id of this OntologyProjectStatus.

        :return: The status_id of this OntologyProjectStatus.
        :rtype: str
        """
        return self._status_id

    @status_id.setter
    def status_id(self, status_id):
        """
        Sets the status_id of this OntologyProjectStatus.

        :param status_id: The status_id of this OntologyProjectStatus.
        :type: str
        """
        self._status_id = status_id

    @property
    def project_id(self):
        """
        **[Required]** Gets the project_id of this OntologyProjectStatus.

        :return: The project_id of this OntologyProjectStatus.
        :rtype: str
        """
        return self._project_id

    @project_id.setter
    def project_id(self, project_id):
        """
        Sets the project_id of this OntologyProjectStatus.

        :param project_id: The project_id of this OntologyProjectStatus.
        :type: str
        """
        self._project_id = project_id

    @property
    def project_version(self):
        """
        **[Required]** Gets the project_version of this OntologyProjectStatus.
        OMS project metadata version captured when publish starts.


        :return: The project_version of this OntologyProjectStatus.
        :rtype: int
        """
        return self._project_version

    @project_version.setter
    def project_version(self, project_version):
        """
        Sets the project_version of this OntologyProjectStatus.
        OMS project metadata version captured when publish starts.


        :param project_version: The project_version of this OntologyProjectStatus.
        :type: int
        """
        self._project_version = project_version

    @property
    def publish_version(self):
        """
        Gets the publish_version of this OntologyProjectStatus.
        Monotonic publish version for the project.


        :return: The publish_version of this OntologyProjectStatus.
        :rtype: int
        """
        return self._publish_version

    @publish_version.setter
    def publish_version(self, publish_version):
        """
        Sets the publish_version of this OntologyProjectStatus.
        Monotonic publish version for the project.


        :param publish_version: The publish_version of this OntologyProjectStatus.
        :type: int
        """
        self._publish_version = publish_version

    @property
    def status(self):
        """
        **[Required]** Gets the status of this OntologyProjectStatus.
        Allowed values for this property are: "CREATED", "UPDATED", "VALIDATING", "VALIDATION_FAILED", "PUBLISHING", "PUBLISHED", "PUBLISH_FAILED", "UNPUBLISHING", "UNPUBLISHED", "UNPUBLISH_FAILED", "ARCHIVED"


        :return: The status of this OntologyProjectStatus.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this OntologyProjectStatus.

        :param status: The status of this OntologyProjectStatus.
        :type: str
        """
        allowed_values = ["CREATED", "UPDATED", "VALIDATING", "VALIDATION_FAILED", "PUBLISHING", "PUBLISHED", "PUBLISH_FAILED", "UNPUBLISHING", "UNPUBLISHED", "UNPUBLISH_FAILED", "ARCHIVED"]
        if not value_allowed_none_or_none_sentinel(status, allowed_values):
            raise ValueError(
                "Invalid value for `status`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._status = status

    @property
    def comment(self):
        """
        Gets the comment of this OntologyProjectStatus.

        :return: The comment of this OntologyProjectStatus.
        :rtype: str
        """
        return self._comment

    @comment.setter
    def comment(self, comment):
        """
        Sets the comment of this OntologyProjectStatus.

        :param comment: The comment of this OntologyProjectStatus.
        :type: str
        """
        self._comment = comment

    @property
    def validation_report(self):
        """
        Gets the validation_report of this OntologyProjectStatus.
        JSON validation report produced by a compiler worker.


        :return: The validation_report of this OntologyProjectStatus.
        :rtype: str
        """
        return self._validation_report

    @validation_report.setter
    def validation_report(self, validation_report):
        """
        Sets the validation_report of this OntologyProjectStatus.
        JSON validation report produced by a compiler worker.


        :param validation_report: The validation_report of this OntologyProjectStatus.
        :type: str
        """
        self._validation_report = validation_report

    @property
    def compiled_artifact_ref(self):
        """
        Gets the compiled_artifact_ref of this OntologyProjectStatus.

        :return: The compiled_artifact_ref of this OntologyProjectStatus.
        :rtype: str
        """
        return self._compiled_artifact_ref

    @compiled_artifact_ref.setter
    def compiled_artifact_ref(self, compiled_artifact_ref):
        """
        Sets the compiled_artifact_ref of this OntologyProjectStatus.

        :param compiled_artifact_ref: The compiled_artifact_ref of this OntologyProjectStatus.
        :type: str
        """
        self._compiled_artifact_ref = compiled_artifact_ref

    @property
    def error_message(self):
        """
        Gets the error_message of this OntologyProjectStatus.

        :return: The error_message of this OntologyProjectStatus.
        :rtype: str
        """
        return self._error_message

    @error_message.setter
    def error_message(self, error_message):
        """
        Sets the error_message of this OntologyProjectStatus.

        :param error_message: The error_message of this OntologyProjectStatus.
        :type: str
        """
        self._error_message = error_message

    @property
    def idempotency_key(self):
        """
        Gets the idempotency_key of this OntologyProjectStatus.

        :return: The idempotency_key of this OntologyProjectStatus.
        :rtype: str
        """
        return self._idempotency_key

    @idempotency_key.setter
    def idempotency_key(self, idempotency_key):
        """
        Sets the idempotency_key of this OntologyProjectStatus.

        :param idempotency_key: The idempotency_key of this OntologyProjectStatus.
        :type: str
        """
        self._idempotency_key = idempotency_key

    @property
    def time_created(self):
        """
        Gets the time_created of this OntologyProjectStatus.

        :return: The time_created of this OntologyProjectStatus.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this OntologyProjectStatus.

        :param time_created: The time_created of this OntologyProjectStatus.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this OntologyProjectStatus.

        :return: The time_updated of this OntologyProjectStatus.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this OntologyProjectStatus.

        :param time_updated: The time_updated of this OntologyProjectStatus.
        :type: datetime
        """
        self._time_updated = time_updated

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
