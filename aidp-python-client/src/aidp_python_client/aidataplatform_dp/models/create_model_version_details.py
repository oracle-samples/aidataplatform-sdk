# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateModelVersionDetails(object):
    """
    The data to create a ModelVersion.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateModelVersionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param name:
            The value to assign to the name property of this CreateModelVersionDetails.
        :type name: str

        :param description:
            The value to assign to the description property of this CreateModelVersionDetails.
        :type description: str

        :param source:
            The value to assign to the source property of this CreateModelVersionDetails.
        :type source: str

        :param run_id:
            The value to assign to the run_id property of this CreateModelVersionDetails.
        :type run_id: str

        :param tags:
            The value to assign to the tags property of this CreateModelVersionDetails.
        :type tags: list[oci.aidataplatform_dp.models.ModelVersionTag]

        :param run_link:
            The value to assign to the run_link property of this CreateModelVersionDetails.
        :type run_link: str

        :param model_id:
            The value to assign to the model_id property of this CreateModelVersionDetails.
        :type model_id: str

        """
        self.swagger_types = {
            'name': 'str',
            'description': 'str',
            'source': 'str',
            'run_id': 'str',
            'tags': 'list[ModelVersionTag]',
            'run_link': 'str',
            'model_id': 'str'
        }

        self.attribute_map = {
            'name': 'name',
            'description': 'description',
            'source': 'source',
            'run_id': 'run_id',
            'tags': 'tags',
            'run_link': 'run_link',
            'model_id': 'model_id'
        }

        self._name = None
        self._description = None
        self._source = None
        self._run_id = None
        self._tags = None
        self._run_link = None
        self._model_id = None

    @property
    def name(self):
        """
        **[Required]** Gets the name of this CreateModelVersionDetails.
        Register models under this name.


        :return: The name of this CreateModelVersionDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this CreateModelVersionDetails.
        Register models under this name.


        :param name: The name of this CreateModelVersionDetails.
        :type: str
        """
        self._name = name

    @property
    def description(self):
        """
        Gets the description of this CreateModelVersionDetails.
        Description of this model version.


        :return: The description of this CreateModelVersionDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CreateModelVersionDetails.
        Description of this model version.


        :param description: The description of this CreateModelVersionDetails.
        :type: str
        """
        self._description = description

    @property
    def source(self):
        """
        **[Required]** Gets the source of this CreateModelVersionDetails.
        URI indicating the location of the source model artifacts.


        :return: The source of this CreateModelVersionDetails.
        :rtype: str
        """
        return self._source

    @source.setter
    def source(self, source):
        """
        Sets the source of this CreateModelVersionDetails.
        URI indicating the location of the source model artifacts.


        :param source: The source of this CreateModelVersionDetails.
        :type: str
        """
        self._source = source

    @property
    def run_id(self):
        """
        Gets the run_id of this CreateModelVersionDetails.
        Run ID that generated the model version.


        :return: The run_id of this CreateModelVersionDetails.
        :rtype: str
        """
        return self._run_id

    @run_id.setter
    def run_id(self, run_id):
        """
        Sets the run_id of this CreateModelVersionDetails.
        Run ID that generated the model version.


        :param run_id: The run_id of this CreateModelVersionDetails.
        :type: str
        """
        self._run_id = run_id

    @property
    def tags(self):
        """
        Gets the tags of this CreateModelVersionDetails.
        Tags of model version.


        :return: The tags of this CreateModelVersionDetails.
        :rtype: list[oci.aidataplatform_dp.models.ModelVersionTag]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """
        Sets the tags of this CreateModelVersionDetails.
        Tags of model version.


        :param tags: The tags of this CreateModelVersionDetails.
        :type: list[oci.aidataplatform_dp.models.ModelVersionTag]
        """
        self._tags = tags

    @property
    def run_link(self):
        """
        Gets the run_link of this CreateModelVersionDetails.
        Run Link: Direct link to the run that generated this version.


        :return: The run_link of this CreateModelVersionDetails.
        :rtype: str
        """
        return self._run_link

    @run_link.setter
    def run_link(self, run_link):
        """
        Sets the run_link of this CreateModelVersionDetails.
        Run Link: Direct link to the run that generated this version.


        :param run_link: The run_link of this CreateModelVersionDetails.
        :type: str
        """
        self._run_link = run_link

    @property
    def model_id(self):
        """
        Gets the model_id of this CreateModelVersionDetails.
        Model id for model version that is used to link the registered model to the source logged model.


        :return: The model_id of this CreateModelVersionDetails.
        :rtype: str
        """
        return self._model_id

    @model_id.setter
    def model_id(self, model_id):
        """
        Sets the model_id of this CreateModelVersionDetails.
        Model id for model version that is used to link the registered model to the source logged model.


        :param model_id: The model_id of this CreateModelVersionDetails.
        :type: str
        """
        self._model_id = model_id

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
