# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class LoggedModelInfo(object):
    """
    Details of the LoggedModel Info.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new LoggedModelInfo object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param model_id:
            The value to assign to the model_id property of this LoggedModelInfo.
        :type model_id: str

        :param experiment_id:
            The value to assign to the experiment_id property of this LoggedModelInfo.
        :type experiment_id: str

        :param name:
            The value to assign to the name property of this LoggedModelInfo.
        :type name: str

        :param creation_timestamp_ms:
            The value to assign to the creation_timestamp_ms property of this LoggedModelInfo.
        :type creation_timestamp_ms: int

        :param last_updated_timestamp_ms:
            The value to assign to the last_updated_timestamp_ms property of this LoggedModelInfo.
        :type last_updated_timestamp_ms: int

        :param artifact_uri:
            The value to assign to the artifact_uri property of this LoggedModelInfo.
        :type artifact_uri: str

        :param status:
            The value to assign to the status property of this LoggedModelInfo.
        :type status: str

        :param model_type:
            The value to assign to the model_type property of this LoggedModelInfo.
        :type model_type: str

        :param source_run_id:
            The value to assign to the source_run_id property of this LoggedModelInfo.
        :type source_run_id: str

        :param tags:
            The value to assign to the tags property of this LoggedModelInfo.
        :type tags: list[oci.aidataplatform_dp.models.LoggedModelTag]

        """
        self.swagger_types = {
            'model_id': 'str',
            'experiment_id': 'str',
            'name': 'str',
            'creation_timestamp_ms': 'int',
            'last_updated_timestamp_ms': 'int',
            'artifact_uri': 'str',
            'status': 'str',
            'model_type': 'str',
            'source_run_id': 'str',
            'tags': 'list[LoggedModelTag]'
        }

        self.attribute_map = {
            'model_id': 'model_id',
            'experiment_id': 'experiment_id',
            'name': 'name',
            'creation_timestamp_ms': 'creation_timestamp_ms',
            'last_updated_timestamp_ms': 'last_updated_timestamp_ms',
            'artifact_uri': 'artifact_uri',
            'status': 'status',
            'model_type': 'model_type',
            'source_run_id': 'source_run_id',
            'tags': 'tags'
        }

        self._model_id = None
        self._experiment_id = None
        self._name = None
        self._creation_timestamp_ms = None
        self._last_updated_timestamp_ms = None
        self._artifact_uri = None
        self._status = None
        self._model_type = None
        self._source_run_id = None
        self._tags = None

    @property
    def model_id(self):
        """
        Gets the model_id of this LoggedModelInfo.
        id of logged-model.


        :return: The model_id of this LoggedModelInfo.
        :rtype: str
        """
        return self._model_id

    @model_id.setter
    def model_id(self, model_id):
        """
        Sets the model_id of this LoggedModelInfo.
        id of logged-model.


        :param model_id: The model_id of this LoggedModelInfo.
        :type: str
        """
        self._model_id = model_id

    @property
    def experiment_id(self):
        """
        Gets the experiment_id of this LoggedModelInfo.
        Unique identifier for the experiment.


        :return: The experiment_id of this LoggedModelInfo.
        :rtype: str
        """
        return self._experiment_id

    @experiment_id.setter
    def experiment_id(self, experiment_id):
        """
        Sets the experiment_id of this LoggedModelInfo.
        Unique identifier for the experiment.


        :param experiment_id: The experiment_id of this LoggedModelInfo.
        :type: str
        """
        self._experiment_id = experiment_id

    @property
    def name(self):
        """
        Gets the name of this LoggedModelInfo.
        name of logged-model.


        :return: The name of this LoggedModelInfo.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this LoggedModelInfo.
        name of logged-model.


        :param name: The name of this LoggedModelInfo.
        :type: str
        """
        self._name = name

    @property
    def creation_timestamp_ms(self):
        """
        Gets the creation_timestamp_ms of this LoggedModelInfo.
        Unix timestamp in milliseconds when the logged-model was created.


        :return: The creation_timestamp_ms of this LoggedModelInfo.
        :rtype: int
        """
        return self._creation_timestamp_ms

    @creation_timestamp_ms.setter
    def creation_timestamp_ms(self, creation_timestamp_ms):
        """
        Sets the creation_timestamp_ms of this LoggedModelInfo.
        Unix timestamp in milliseconds when the logged-model was created.


        :param creation_timestamp_ms: The creation_timestamp_ms of this LoggedModelInfo.
        :type: int
        """
        self._creation_timestamp_ms = creation_timestamp_ms

    @property
    def last_updated_timestamp_ms(self):
        """
        Gets the last_updated_timestamp_ms of this LoggedModelInfo.
        Unix timestamp in milliseconds when the logged-model was last updated.


        :return: The last_updated_timestamp_ms of this LoggedModelInfo.
        :rtype: int
        """
        return self._last_updated_timestamp_ms

    @last_updated_timestamp_ms.setter
    def last_updated_timestamp_ms(self, last_updated_timestamp_ms):
        """
        Sets the last_updated_timestamp_ms of this LoggedModelInfo.
        Unix timestamp in milliseconds when the logged-model was last updated.


        :param last_updated_timestamp_ms: The last_updated_timestamp_ms of this LoggedModelInfo.
        :type: int
        """
        self._last_updated_timestamp_ms = last_updated_timestamp_ms

    @property
    def artifact_uri(self):
        """
        Gets the artifact_uri of this LoggedModelInfo.
        artifact_uri.


        :return: The artifact_uri of this LoggedModelInfo.
        :rtype: str
        """
        return self._artifact_uri

    @artifact_uri.setter
    def artifact_uri(self, artifact_uri):
        """
        Sets the artifact_uri of this LoggedModelInfo.
        artifact_uri.


        :param artifact_uri: The artifact_uri of this LoggedModelInfo.
        :type: str
        """
        self._artifact_uri = artifact_uri

    @property
    def status(self):
        """
        Gets the status of this LoggedModelInfo.
        status of logged-model.


        :return: The status of this LoggedModelInfo.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this LoggedModelInfo.
        status of logged-model.


        :param status: The status of this LoggedModelInfo.
        :type: str
        """
        self._status = status

    @property
    def model_type(self):
        """
        Gets the model_type of this LoggedModelInfo.
        model_type of logged-model.


        :return: The model_type of this LoggedModelInfo.
        :rtype: str
        """
        return self._model_type

    @model_type.setter
    def model_type(self, model_type):
        """
        Sets the model_type of this LoggedModelInfo.
        model_type of logged-model.


        :param model_type: The model_type of this LoggedModelInfo.
        :type: str
        """
        self._model_type = model_type

    @property
    def source_run_id(self):
        """
        Gets the source_run_id of this LoggedModelInfo.
        source_run_id of logged-model.


        :return: The source_run_id of this LoggedModelInfo.
        :rtype: str
        """
        return self._source_run_id

    @source_run_id.setter
    def source_run_id(self, source_run_id):
        """
        Sets the source_run_id of this LoggedModelInfo.
        source_run_id of logged-model.


        :param source_run_id: The source_run_id of this LoggedModelInfo.
        :type: str
        """
        self._source_run_id = source_run_id

    @property
    def tags(self):
        """
        Gets the tags of this LoggedModelInfo.
        tags of logged-model


        :return: The tags of this LoggedModelInfo.
        :rtype: list[oci.aidataplatform_dp.models.LoggedModelTag]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """
        Sets the tags of this LoggedModelInfo.
        tags of logged-model


        :param tags: The tags of this LoggedModelInfo.
        :type: list[oci.aidataplatform_dp.models.LoggedModelTag]
        """
        self._tags = tags

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
