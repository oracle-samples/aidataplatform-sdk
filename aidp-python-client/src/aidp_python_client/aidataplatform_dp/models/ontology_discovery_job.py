# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyDiscoveryJob(object):
    """
    Ontology discovery job metadata.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyDiscoveryJob object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param id:
            The value to assign to the id property of this OntologyDiscoveryJob.
        :type id: str

        :param project_key:
            The value to assign to the project_key property of this OntologyDiscoveryJob.
        :type project_key: str

        :param display_name:
            The value to assign to the display_name property of this OntologyDiscoveryJob.
        :type display_name: str

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this OntologyDiscoveryJob.
        :type lifecycle_state: str

        :param progress:
            The value to assign to the progress property of this OntologyDiscoveryJob.
        :type progress: oci.aidataplatform_dp.models.OntologyDiscoveryProgress

        :param artifacts:
            The value to assign to the artifacts property of this OntologyDiscoveryJob.
        :type artifacts: oci.aidataplatform_dp.models.OntologyDiscoveryArtifacts

        :param error_code:
            The value to assign to the error_code property of this OntologyDiscoveryJob.
        :type error_code: str

        :param error_message:
            The value to assign to the error_message property of this OntologyDiscoveryJob.
        :type error_message: str

        :param creator:
            The value to assign to the creator property of this OntologyDiscoveryJob.
        :type creator: str

        :param time_created:
            The value to assign to the time_created property of this OntologyDiscoveryJob.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this OntologyDiscoveryJob.
        :type time_updated: datetime

        """
        self.swagger_types = {
            'id': 'str',
            'project_key': 'str',
            'display_name': 'str',
            'lifecycle_state': 'str',
            'progress': 'OntologyDiscoveryProgress',
            'artifacts': 'OntologyDiscoveryArtifacts',
            'error_code': 'str',
            'error_message': 'str',
            'creator': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime'
        }
        self.attribute_map = {
            'id': 'id',
            'project_key': 'projectKey',
            'display_name': 'displayName',
            'lifecycle_state': 'lifecycleState',
            'progress': 'progress',
            'artifacts': 'artifacts',
            'error_code': 'errorCode',
            'error_message': 'errorMessage',
            'creator': 'creator',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated'
        }
        self._id = None
        self._project_key = None
        self._display_name = None
        self._lifecycle_state = None
        self._progress = None
        self._artifacts = None
        self._error_code = None
        self._error_message = None
        self._creator = None
        self._time_created = None
        self._time_updated = None

    @property
    def id(self):
        """
        Gets the id of this OntologyDiscoveryJob.
        Discovery job identifier.


        :return: The id of this OntologyDiscoveryJob.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this OntologyDiscoveryJob.
        Discovery job identifier.


        :param id: The id of this OntologyDiscoveryJob.
        :type: str
        """
        self._id = id

    @property
    def project_key(self):
        """
        Gets the project_key of this OntologyDiscoveryJob.
        Ontology project key.


        :return: The project_key of this OntologyDiscoveryJob.
        :rtype: str
        """
        return self._project_key

    @project_key.setter
    def project_key(self, project_key):
        """
        Sets the project_key of this OntologyDiscoveryJob.
        Ontology project key.


        :param project_key: The project_key of this OntologyDiscoveryJob.
        :type: str
        """
        self._project_key = project_key

    @property
    def display_name(self):
        """
        Gets the display_name of this OntologyDiscoveryJob.
        Discovery job display name.


        :return: The display_name of this OntologyDiscoveryJob.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this OntologyDiscoveryJob.
        Discovery job display name.


        :param display_name: The display_name of this OntologyDiscoveryJob.
        :type: str
        """
        self._display_name = display_name

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this OntologyDiscoveryJob.
        Discovery job lifecycle state.


        :return: The lifecycle_state of this OntologyDiscoveryJob.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this OntologyDiscoveryJob.
        Discovery job lifecycle state.


        :param lifecycle_state: The lifecycle_state of this OntologyDiscoveryJob.
        :type: str
        """
        self._lifecycle_state = lifecycle_state

    @property
    def progress(self):
        """
        Gets the progress of this OntologyDiscoveryJob.

        :return: The progress of this OntologyDiscoveryJob.
        :rtype: oci.aidataplatform_dp.models.OntologyDiscoveryProgress
        """
        return self._progress

    @progress.setter
    def progress(self, progress):
        """
        Sets the progress of this OntologyDiscoveryJob.

        :param progress: The progress of this OntologyDiscoveryJob.
        :type: oci.aidataplatform_dp.models.OntologyDiscoveryProgress
        """
        self._progress = progress

    @property
    def artifacts(self):
        """
        Gets the artifacts of this OntologyDiscoveryJob.

        :return: The artifacts of this OntologyDiscoveryJob.
        :rtype: oci.aidataplatform_dp.models.OntologyDiscoveryArtifacts
        """
        return self._artifacts

    @artifacts.setter
    def artifacts(self, artifacts):
        """
        Sets the artifacts of this OntologyDiscoveryJob.

        :param artifacts: The artifacts of this OntologyDiscoveryJob.
        :type: oci.aidataplatform_dp.models.OntologyDiscoveryArtifacts
        """
        self._artifacts = artifacts

    @property
    def error_code(self):
        """
        Gets the error_code of this OntologyDiscoveryJob.
        Discovery failure code.


        :return: The error_code of this OntologyDiscoveryJob.
        :rtype: str
        """
        return self._error_code

    @error_code.setter
    def error_code(self, error_code):
        """
        Sets the error_code of this OntologyDiscoveryJob.
        Discovery failure code.


        :param error_code: The error_code of this OntologyDiscoveryJob.
        :type: str
        """
        self._error_code = error_code

    @property
    def error_message(self):
        """
        Gets the error_message of this OntologyDiscoveryJob.
        Discovery failure message.


        :return: The error_message of this OntologyDiscoveryJob.
        :rtype: str
        """
        return self._error_message

    @error_message.setter
    def error_message(self, error_message):
        """
        Sets the error_message of this OntologyDiscoveryJob.
        Discovery failure message.


        :param error_message: The error_message of this OntologyDiscoveryJob.
        :type: str
        """
        self._error_message = error_message

    @property
    def creator(self):
        """
        Gets the creator of this OntologyDiscoveryJob.
        Discovery job creator.


        :return: The creator of this OntologyDiscoveryJob.
        :rtype: str
        """
        return self._creator

    @creator.setter
    def creator(self, creator):
        """
        Sets the creator of this OntologyDiscoveryJob.
        Discovery job creator.


        :param creator: The creator of this OntologyDiscoveryJob.
        :type: str
        """
        self._creator = creator

    @property
    def time_created(self):
        """
        Gets the time_created of this OntologyDiscoveryJob.
        Discovery job creation time.


        :return: The time_created of this OntologyDiscoveryJob.
        :rtype: datetime
        """
        return self._time_created

    @time_created.setter
    def time_created(self, time_created):
        """
        Sets the time_created of this OntologyDiscoveryJob.
        Discovery job creation time.


        :param time_created: The time_created of this OntologyDiscoveryJob.
        :type: datetime
        """
        self._time_created = time_created

    @property
    def time_updated(self):
        """
        Gets the time_updated of this OntologyDiscoveryJob.
        Discovery job update time.


        :return: The time_updated of this OntologyDiscoveryJob.
        :rtype: datetime
        """
        return self._time_updated

    @time_updated.setter
    def time_updated(self, time_updated):
        """
        Sets the time_updated of this OntologyDiscoveryJob.
        Discovery job update time.


        :param time_updated: The time_updated of this OntologyDiscoveryJob.
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
